package typings.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.OBB")
@js.native
/**
  * Constructs a new OBB with the given values.
  *
  * @param [center=Vector3(0,0,0)] - The center of this OBB.
  * @param [halfSizes=Vector3(0,0,0)] - The half sizes of the OBB (defines its width, height and depth).
  * @param [rotation=Matrix()] - The rotation of this OBB.
  */
open class OBB ()
  extends typings.yuka.mod.OBB {
  def this(center: typings.yuka.srcMathVector3Mod.Vector3) = this()
  def this(center: Unit, halfSizes: typings.yuka.srcMathVector3Mod.Vector3) = this()
  def this(center: typings.yuka.srcMathVector3Mod.Vector3, halfSizes: typings.yuka.srcMathVector3Mod.Vector3) = this()
  def this(center: Unit, halfSizes: Unit, rotation: typings.yuka.srcMathMatrix3Mod.Matrix3) = this()
  def this(
    center: Unit,
    halfSizes: typings.yuka.srcMathVector3Mod.Vector3,
    rotation: typings.yuka.srcMathMatrix3Mod.Matrix3
  ) = this()
  def this(
    center: typings.yuka.srcMathVector3Mod.Vector3,
    halfSizes: Unit,
    rotation: typings.yuka.srcMathMatrix3Mod.Matrix3
  ) = this()
  def this(
    center: typings.yuka.srcMathVector3Mod.Vector3,
    halfSizes: typings.yuka.srcMathVector3Mod.Vector3,
    rotation: typings.yuka.srcMathMatrix3Mod.Matrix3
  ) = this()
}
