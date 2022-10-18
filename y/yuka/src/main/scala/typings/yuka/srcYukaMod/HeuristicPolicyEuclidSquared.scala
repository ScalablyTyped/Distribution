package typings.yuka.srcYukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "HeuristicPolicyEuclidSquared")
@js.native
open class HeuristicPolicyEuclidSquared ()
  extends typings.yuka.srcGraphExtraHeuristicPolicyMod.HeuristicPolicyEuclidSquared
/* static members */
object HeuristicPolicyEuclidSquared {
  
  @JSImport("yuka/src/Yuka", "HeuristicPolicyEuclidSquared")
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
  inline def calculate(
    graph: typings.yuka.srcGraphCoreGraphMod.Graph[typings.yuka.srcGraphCoreNodeMod.Node, typings.yuka.srcGraphCoreEdgeMod.Edge],
    source: Double,
    target: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
}
