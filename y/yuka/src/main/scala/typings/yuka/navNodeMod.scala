package typings.yuka

import typings.yuka.nodeMod.Node
import typings.yuka.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navNodeMod {
  
  @JSImport("yuka/src/navigation/core/NavNode", "NavNode")
  @js.native
  /**
    * Constructs a new navigation node.
    *
    * @param [index=-1] - The unique index of this node.
    * @param [position] - The position of the node in 3D space.
    * @param [userData] - Custom user data connected to this node.
    */
  open class NavNode () extends Node {
    def this(index: Double) = this()
    def this(index: Double, position: Vector3) = this()
    def this(index: Unit, position: Vector3) = this()
    def this(index: Double, position: Unit, userData: js.Object) = this()
    def this(index: Double, position: Vector3, userData: js.Object) = this()
    def this(index: Unit, position: Unit, userData: js.Object) = this()
    def this(index: Unit, position: Vector3, userData: js.Object) = this()
    
    /**
      * The position of the node in 3D space.
      */
    var position: Vector3 = js.native
    
    /**
      * Custom user data connected to this node.
      */
    var userData: js.Object = js.native
  }
}
