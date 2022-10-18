package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGraphCoreEdgeMod {
  
  @JSImport("yuka/src/graph/core/Edge", "Edge")
  @js.native
  /**
    * Constructs a new edge.
    *
    * @param [from=-1] - The index of the from node.
    * @param [to=-1] - The index of the to node.
    * @param [cost=0] - The cost of this edge.
    */
  open class Edge () extends StObject {
    def this(from: Double) = this()
    def this(from: Double, to: Double) = this()
    def this(from: Unit, to: Double) = this()
    def this(from: Double, to: Double, cost: Double) = this()
    def this(from: Double, to: Unit, cost: Double) = this()
    def this(from: Unit, to: Double, cost: Double) = this()
    def this(from: Unit, to: Unit, cost: Double) = this()
    
    /**
      * Copies all values from the given edge to this edge.
      *
      * @param edge - The edge to copy.
      */
    def copy(edge: Edge): this.type = js.native
    
    /**
      * The cost of this edge. This could be for example a distance or time value.
      * @default 0
      */
    var cost: Double = js.native
    
    /**
      * The index of the *from* node.
      * @default -1
      */
    var from: Double = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * The index of the *to* node.
      * @default -1
      */
    var to: Double = js.native
    
    /**
      * Transforms this instance into a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
