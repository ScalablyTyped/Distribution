package typings.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "ArriveBehavior")
@js.native
/**
  * Constructs a new arrive behavior.
  *
  * @param [target] - The target vector.
  * @param [deceleration] - The amount of deceleration.
  * @param [tolerance] - A tolerance value in world units to prevent the vehicle from overshooting its target.
  */
open class ArriveBehavior ()
  extends typings.yuka.srcYukaMod.ArriveBehavior {
  def this(target: typings.yuka.srcMathVector3Mod.Vector3) = this()
  def this(target: Unit, deceleration: Double) = this()
  def this(target: typings.yuka.srcMathVector3Mod.Vector3, deceleration: Double) = this()
  def this(target: Unit, deceleration: Double, tolerance: Double) = this()
  def this(target: Unit, deceleration: Unit, tolerance: Double) = this()
  def this(target: typings.yuka.srcMathVector3Mod.Vector3, deceleration: Double, tolerance: Double) = this()
  def this(target: typings.yuka.srcMathVector3Mod.Vector3, deceleration: Unit, tolerance: Double) = this()
}
