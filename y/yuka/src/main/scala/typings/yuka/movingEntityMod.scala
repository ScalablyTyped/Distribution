package typings.yuka

import typings.yuka.gameEntityMod.GameEntity
import typings.yuka.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object movingEntityMod {
  
  @JSImport("yuka/src/core/MovingEntity", "MovingEntity")
  @js.native
  /**
    * Constructs a new moving entity.
    */
  open class MovingEntity () extends GameEntity {
    
    /**
      * Returns the current speed of this game entity.
      *
      * @return The current speed.
      */
    def getSpeed(): Double = js.native
    
    /**
      * Returns the current speed in squared space of this game entity.
      *
      * @return The current speed in squared space.
      */
    def getSpeedSquared(): Double = js.native
    
    /**
      * The maximum speed at which this game entity may travel.
      * @default 1
      */
    var maxSpeed: Double = js.native
    
    /**
      * Whether the orientation of this game entity will be updated based on the velocity or not.
      * @default true
      */
    var updateOrientation: Boolean = js.native
    
    /**
      * The velocity of this game entity.
      * @default Vector3(0,0,0)
      */
    var velocity: Vector3 = js.native
  }
}
