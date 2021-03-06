package io.johnliu.elementtd.level.projectile;

import io.johnliu.elementtd.level.mob.Mob;
import io.johnliu.elementtd.renderengine.RenderEngine;
import io.johnliu.elementtd.renderengine.entity.projectile.ProjectileEntity;

public class BasicProjectile extends Projectile {

    private ProjectileEntity projEntity;

    public BasicProjectile(float x, float y, float damage, float armorPiercing, Mob target) {
        super(x, y, 4.0f, damage, armorPiercing, target, null);

        projEntity = new ProjectileEntity(x, y, target.getX(), target.getY());
    }

    public boolean update() {
        projEntity.capture(x, y);
        return super.update();
    }

    public void render(RenderEngine engine) {
        projEntity.render(engine);
    }

}
