package typings.yuka

import typings.yuka.edgeMod.Edge
import typings.yuka.graphMod.Graph
import typings.yuka.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heuristicPolicyMod {
  
  @JSImport("yuka/src/graph/extra/HeuristicPolicy", "HeuristicPolicyDijkstra")
  @js.native
  open class HeuristicPolicyDijkstra () extends StObject
  /* static members */
  object HeuristicPolicyDijkstra {
    
    @JSImport("yuka/src/graph/extra/HeuristicPolicy", "HeuristicPolicyDijkstra")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This heuristic always returns *0*. The {@link AStar} algorithm
      * behaves with this heuristic exactly like {@link Dijkstra}
      *
      * @param graph - The graph.
      * @param source - The index of the source node.
      * @param target - The index of the target node.
      * @return The value 0.
      */
    inline def calculate(graph: Graph[Node, Edge], source: Double, target: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("yuka/src/graph/extra/HeuristicPolicy", "HeuristicPolicyEuclid")
  @js.native
  open class HeuristicPolicyEuclid () extends StObject
  /* static members */
  object HeuristicPolicyEuclid {
    
    @JSImport("yuka/src/graph/extra/HeuristicPolicy", "HeuristicPolicyEuclid")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates the euclidean distance between two nodes.
      *
      * @param graph - The graph.
      * @param source - The index of the source node.
      * @param target - The index of the target node.
      * @return The euclidean distance between both nodes.
      */
    inline def calculate(graph: Graph[Node, Edge], source: Double, target: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("yuka/src/graph/extra/HeuristicPolicy", "HeuristicPolicyEuclidSquared")
  @js.native
  open class HeuristicPolicyEuclidSquared () extends StObject
  /* static members */
  object HeuristicPolicyEuclidSquared {
    
    @JSImport("yuka/src/graph/extra/HeuristicPolicy", "HeuristicPolicyEuclidSquared")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates the squared euclidean distance between two nodes.
      *
      * @param graph - The graph.
      * @param source - The index of the source node.
      * @param target - The index of the target node.
      * @return The squared euclidean distance between both nodes.
      */
    inline def calculate(graph: Graph[Node, Edge], source: Double, target: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("yuka/src/graph/extra/HeuristicPolicy", "HeuristicPolicyManhattan")
  @js.native
  open class HeuristicPolicyManhattan () extends StObject
  /* static members */
  object HeuristicPolicyManhattan {
    
    @JSImport("yuka/src/graph/extra/HeuristicPolicy", "HeuristicPolicyManhattan")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates the manhattan distance between two nodes.
      *
      * @param graph - The graph.
      * @param source - The index of the source node.
      * @param target - The index of the target node.
      * @return The manhattan distance between both nodes.
      */
    inline def calculate(graph: Graph[Node, Edge], source: Double, target: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
