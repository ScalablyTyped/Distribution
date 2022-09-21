package typings.yuka

import typings.yuka.steeringBehaviorMod.SteeringBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wanderBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/WanderBehavior", "WanderBehavior")
  @js.native
  /**
    * Constructs a new wander behavior.
    *
    * @param [radius] - The radius of the wander circle for the wander behavior.
    * @param [distance] - The distance the wander circle is projected in front of the agent.
    * @param [jitter] - The maximum amount of displacement along the sphere each frame.
    */
  open class WanderBehavior () extends SteeringBehavior {
    def this(radius: Double) = this()
    def this(radius: Double, distance: Double) = this()
    def this(radius: Unit, distance: Double) = this()
    def this(radius: Double, distance: Double, jitter: Double) = this()
    def this(radius: Double, distance: Unit, jitter: Double) = this()
    def this(radius: Unit, distance: Double, jitter: Double) = this()
    def this(radius: Unit, distance: Unit, jitter: Double) = this()
    
    /**
      * The distance the wander sphere is projected in front of the agent.
      * @default 5
      */
    var distance: Double = js.native
    
    /**
      * The maximum amount of displacement along the sphere each frame.
      * @default 5
      */
    var jitter: Double = js.native
    
    /**
      * The radius of the constraining circle for the wander behavior.
      * @default 1
      */
    var radius: Double = js.native
  }
}
