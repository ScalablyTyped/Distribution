package typings.yuka

import typings.yuka.edgeMod.Edge
import typings.yuka.graphMod.Graph
import typings.yuka.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astarMod {
  
  @JSImport("yuka/src/graph/search/AStar", "AStar")
  @js.native
  /**
    * Constructs an AStar algorithm object.
    *
    * @param [graph=null] - The graph.
    * @param [source=-1] - The node index of the source node.
    * @param [target=-1] - The node index of the target node.
    */
  open class AStar () extends StObject {
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
      * The heuristic of the search.
      * @default {@link HeuristicPolicyEuclid}
      */
    var heuristic: HeuristicPolicy = js.native
    
    /**
      * Executes the graph search.
      * If the search was successful, {@link AStar#found} is set to true.
      */
    def search(): this.type = js.native
    
    /**
      * The node index of the source node.
      * @default -1
      */
    var source: Double = js.native
    
    /**
      * The node index of the target node.
      * @default -1
      */
    var target: Double = js.native
  }
  
  trait HeuristicPolicy extends StObject {
    
    /**
      * Calculates the distance between two nodes.
      *
      * @param graph - The graph.
      * @param source - The index of the source node.
      * @param target - The index of the target node.
      * @return The euclidean distance between both nodes.
      */
    def calculate(graph: Graph[Node, Edge], source: Double, target: Double): Double
  }
  object HeuristicPolicy {
    
    inline def apply(calculate: (Graph[Node, Edge], Double, Double) => Double): HeuristicPolicy = {
      val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction3(calculate))
      __obj.asInstanceOf[HeuristicPolicy]
    }
    
    extension [Self <: HeuristicPolicy](x: Self) {
      
      inline def setCalculate(value: (Graph[Node, Edge], Double, Double) => Double): Self = StObject.set(x, "calculate", js.Any.fromFunction3(value))
    }
  }
}
