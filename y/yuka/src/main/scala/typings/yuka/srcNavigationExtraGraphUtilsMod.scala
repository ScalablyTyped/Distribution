package typings.yuka

import typings.yuka.srcGraphCoreEdgeMod.Edge
import typings.yuka.srcGraphCoreGraphMod.Graph
import typings.yuka.srcGraphCoreNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNavigationExtraGraphUtilsMod {
  
  @JSImport("yuka/src/navigation/extra/GraphUtils", "GraphUtils")
  @js.native
  open class GraphUtils () extends StObject
  /* static members */
  object GraphUtils {
    
    @JSImport("yuka/src/navigation/extra/GraphUtils", "GraphUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Generates a navigation graph with a planar grid layout based on the given parameters.
      *
      * @param size - The size (width and depth) in x and z direction
      * @param segments - The amount of segments in x and z direction.
      * @return The new graph.
      */
    inline def createGridLayout(size: Double, segments: Double): Graph[Node, Edge] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGridLayout")(size.asInstanceOf[js.Any], segments.asInstanceOf[js.Any])).asInstanceOf[Graph[Node, Edge]]
  }
}
