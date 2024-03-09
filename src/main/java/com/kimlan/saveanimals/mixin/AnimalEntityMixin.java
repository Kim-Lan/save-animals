package com.kimlan.saveanimals.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(AnimalEntity.class)
abstract class AnimalEntityMixin extends Entity {
    public AnimalEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Override
    public boolean isInvulnerableTo(DamageSource damageSource) {
        return this.hasCustomName() && !(this instanceof Monster);
    }
}
