package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGraphCoreNodeMod {
  
  @JSImport("yuka/src/graph/core/Node", "Node")
  @js.native
  /**
    * Constructs a new node.
    *
    * @param [index=-1] - The unique index of this node.
    */
  open class Node () extends StObject {
    def this(index: Double) = this()
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * The unique index of this node. The default value *-1* means invalid index.
      * @default -1
      */
    var index: Double = js.native
    
    /**
      * Transforms this instance into a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
