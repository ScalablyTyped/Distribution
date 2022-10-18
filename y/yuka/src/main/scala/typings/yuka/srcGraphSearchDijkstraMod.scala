package typings.yuka

import typings.yuka.srcGraphCoreEdgeMod.Edge
import typings.yuka.srcGraphCoreGraphMod.Graph
import typings.yuka.srcGraphCoreNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGraphSearchDijkstraMod {
  
  @JSImport("yuka/src/graph/search/Dijkstra", "Dijkstra")
  @js.native
  /**
    * Constructs an AStar algorithm object.
    *
    * @param [graph=null] - The graph.
    * @param [source=-1] - The node index of the source node.
    * @param [target=-1] - The node index of the target node.
    */
  open class Dijkstra () extends StObject {
    def this(graph: Graph[Node, Edge]) = this()
    def this(graph: Null, source: Double) = this()
    def this(graph: Unit, source: Double) = this()
    def this(graph: Graph[Node, Edge], source: Double) = this()
    def this(graph: Null, source: Double, target: Double) = this()
    def this(graph: Null, source: Unit, target: Double) = this()
    def this(graph: Unit, source: Double, target: Double) = this()
    def this(graph: Unit, source: Unit, target: Double) = this()
    def this(graph: Graph[Node, Edge], source: Double, target: Double) = this()
    def this(graph: Graph[Node, Edge], source: Unit, target: Double) = this()
    
    /**
      * Clears the internal state of the object. A new search is now possible.
      */
    def clear(): this.type = js.native
    
    /**
      * Whether the search was successful or not.
      * @default false
      */
    var found: Boolean = js.native
    
    /**
      * Returns the shortest path from the source to the target node as an array of node indices.
      */
    def getPath(): js.Array[Double] = js.native
    
    /**
      * Returns the search tree of the algorithm as an array of edges.
      */
    def getSearchTree(): js.Array[Edge] = js.native
    
    /**
      * The graph.
      */
    var graph: (Graph[Node, Edge]) | Null = js.native
    
    /**
      * Executes the graph search.
      * If the search was successful, {@link Dijkstra#found} is set to true.
      */
    def search(): this.type = js.native
    
    /**
      * The node index of the source node.
      */
    var source: Double = js.native
    
    /**
      * The node index of the target node.
      */
    var target: Double = js.native
  }
}
