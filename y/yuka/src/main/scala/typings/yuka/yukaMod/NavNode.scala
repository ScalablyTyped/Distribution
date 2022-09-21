package typings.yuka.yukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "NavNode")
@js.native
/**
  * Constructs a new navigation node.
  *
  * @param [index=-1] - The unique index of this node.
  * @param [position] - The position of the node in 3D space.
  * @param [userData] - Custom user data connected to this node.
  */
open class NavNode ()
  extends typings.yuka.navNodeMod.NavNode {
  def this(index: Double) = this()
  def this(index: Double, position: typings.yuka.vector3Mod.Vector3) = this()
  def this(index: Unit, position: typings.yuka.vector3Mod.Vector3) = this()
  def this(index: Double, position: Unit, userData: js.Object) = this()
  def this(index: Double, position: typings.yuka.vector3Mod.Vector3, userData: js.Object) = this()
  def this(index: Unit, position: Unit, userData: js.Object) = this()
  def this(index: Unit, position: typings.yuka.vector3Mod.Vector3, userData: js.Object) = this()
}
