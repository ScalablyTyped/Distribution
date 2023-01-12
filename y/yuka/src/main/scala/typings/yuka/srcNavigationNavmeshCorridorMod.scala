package typings.yuka

import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNavigationNavmeshCorridorMod {
  
  @JSImport("yuka/src/navigation/navmesh/Corridor", "Corridor")
  @js.native
  open class Corridor () extends StObject {
    
    /**
      * Generates the shortest path through the corridor as an array of 3D vectors.
      *
      * @return An array of 3D waypoints.
      */
    def generate(): js.Array[Vector3] = js.native
    
    /**
      * The portal edges of the corridor.
      */
    var portalEdges: js.Array[CorridorPortalEdge] = js.native
    
    /**
      * Adds a portal edge defined by its left and right vertex to this corridor.
      *
      * @param left - The left point (origin) of the portal edge.
      * @param right - The right point (destination) of the portal edge.
      */
    def push(left: Vector3, right: Vector3): this.type = js.native
  }
  
  trait CorridorPortalEdge extends StObject {
    
    var left: Vector3
    
    var right: Vector3
  }
  object CorridorPortalEdge {
    
    inline def apply(left: Vector3, right: Vector3): CorridorPortalEdge = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[CorridorPortalEdge]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CorridorPortalEdge] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: Vector3): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Vector3): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
}
