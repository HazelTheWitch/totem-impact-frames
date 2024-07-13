package gay.frot;

import org.ladysnake.satin.api.event.ShaderEffectRenderCallback;
import org.ladysnake.satin.api.managed.ManagedShaderEffect;
import org.ladysnake.satin.api.managed.ShaderEffectManager;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.util.Identifier;

public class TotemImpactFramesClient implements ClientModInitializer {
	public static final Identifier IMPACT_FRAME_SHADER_ID = TotemImpactFrames.id("shaders/post/impact.json");
	private	static final ManagedShaderEffect IMPACT_FRAME_SHADER = ShaderEffectManager.getInstance().manage(IMPACT_FRAME_SHADER_ID);
	public static int impact_frames = 0;

	@Override
	public void onInitializeClient() {
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if (impact_frames > 0) {
				impact_frames -= 1;
			}
		});
		
		ShaderEffectRenderCallback.EVENT.register(tickDelta -> {
			if (impact_frames > 0) {
				IMPACT_FRAME_SHADER.render(tickDelta);
			}
		});
	}
}