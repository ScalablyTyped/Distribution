package typings.yuka

import typings.yuka.movingEntityMod.MovingEntity
import typings.yuka.smootherMod.Smoother
import typings.yuka.steeringManagerMod.SteeringManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vehicleMod {
  
  @JSImport("yuka/src/steering/Vehicle", "Vehicle")
  @js.native
  /**
    * Constructs a new moving entity.
    */
  open class Vehicle () extends MovingEntity {
    
    /**
      * The mass of the vehicle in kilogram.
      * @default 1
      */
    var mass: Double = js.native
    
    /**
      * The maximum force this entity can produce to power itself.
      * @default 100
      */
    var maxForce: Double = js.native
    
    /**
      * An optional smoother to avoid shakiness due to conflicting steering behaviors.
      * @default null
      */
    var smoother: Smoother | Null = js.native
    
    /** The steering manager of this vehicle. */
    var steering: SteeringManager = js.native
  }
}
