package typings.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.HeuristicPolicyDijkstra")
@js.native
open class HeuristicPolicyDijkstra ()
  extends typings.yuka.mod.HeuristicPolicyDijkstra
/* static members */
object HeuristicPolicyDijkstra {
  
  @JSGlobal("YUKA.HeuristicPolicyDijkstra")
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
  inline def calculate(
    graph: typings.yuka.srcGraphCoreGraphMod.Graph[typings.yuka.srcGraphCoreNodeMod.Node, typings.yuka.srcGraphCoreEdgeMod.Edge],
    source: Double,
    target: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
}
