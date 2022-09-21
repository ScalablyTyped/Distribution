package typings.yuka

import typings.yuka.edgeMod.Edge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navEdgeMod {
  
  @JSImport("yuka/src/navigation/core/NavEdge", "NavEdge")
  @js.native
  /**
    * Constructs a navigation edge.
    *
    * @param [from=-1] - The index of the from node.
    * @param [to=-1] - The index of the to node.
    * @param [cost=-1] - The cost of this edge.
    */
  open class NavEdge () extends Edge {
    def this(from: Double) = this()
    def this(from: Double, to: Double) = this()
    def this(from: Unit, to: Double) = this()
    def this(from: Double, to: Double, cost: Double) = this()
    def this(from: Double, to: Unit, cost: Double) = this()
    def this(from: Unit, to: Double, cost: Double) = this()
    def this(from: Unit, to: Unit, cost: Double) = this()
  }
}
