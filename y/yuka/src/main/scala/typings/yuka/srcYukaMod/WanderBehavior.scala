package typings.yuka.srcYukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "WanderBehavior")
@js.native
/**
  * Constructs a new wander behavior.
  *
  * @param [radius] - The radius of the wander circle for the wander behavior.
  * @param [distance] - The distance the wander circle is projected in front of the agent.
  * @param [jitter] - The maximum amount of displacement along the sphere each frame.
  */
open class WanderBehavior ()
  extends typings.yuka.srcSteeringBehaviorsWanderBehaviorMod.WanderBehavior {
  def this(radius: Double) = this()
  def this(radius: Double, distance: Double) = this()
  def this(radius: Unit, distance: Double) = this()
  def this(radius: Double, distance: Double, jitter: Double) = this()
  def this(radius: Double, distance: Unit, jitter: Double) = this()
  def this(radius: Unit, distance: Double, jitter: Double) = this()
  def this(radius: Unit, distance: Unit, jitter: Double) = this()
}
