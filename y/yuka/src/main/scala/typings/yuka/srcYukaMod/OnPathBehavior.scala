package typings.yuka.srcYukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "OnPathBehavior")
@js.native
/**
  * Constructs a new on path behavior.
  *
  * @param [path] - The path to stay close to.
  * @param [radius] - Defines the width of the path. With a smaller radius, the vehicle will have to follow the path more closely.
  * @param [predictionFactor] - Determines how far the behavior predicts the movement of the vehicle.
  */
open class OnPathBehavior ()
  extends typings.yuka.srcSteeringBehaviorsOnPathBehaviorMod.OnPathBehavior {
  def this(path: typings.yuka.srcSteeringPathMod.Path) = this()
  def this(path: Unit, radius: Double) = this()
  def this(path: typings.yuka.srcSteeringPathMod.Path, radius: Double) = this()
  def this(path: Unit, radius: Double, predictionFactor: Double) = this()
  def this(path: Unit, radius: Unit, predictionFactor: Double) = this()
  def this(path: typings.yuka.srcSteeringPathMod.Path, radius: Double, predictionFactor: Double) = this()
  def this(path: typings.yuka.srcSteeringPathMod.Path, radius: Unit, predictionFactor: Double) = this()
}
