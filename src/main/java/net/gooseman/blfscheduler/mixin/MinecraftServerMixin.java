package net.gooseman.blfscheduler.mixin;

import net.gooseman.blfscheduler.BlfScheduler;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.BooleanSupplier;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {
    @Inject(method = "tickChildren", at = @At("HEAD"))
    private void tick(BooleanSupplier shouldKeepTicking, CallbackInfo ci) {
        BlfScheduler.tick();
    }

}
