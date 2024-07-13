package gay.frot.mixin.client;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import gay.frot.TotemImpactFramesClient;
import net.minecraft.entity.LivingEntity;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Inject(at = @At("RETURN"), method = "tryUseTotem()Z", cancellable = true)
    private void injected(CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValue()) {
            TotemImpactFramesClient.impact_frames = 4;
        }
    }
}
