package typings.yuka

import typings.yuka.srcMathPolyhedronMod.Polyhedron
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathSatMod {
  
  @JSImport("yuka/src/math/SAT", "SAT")
  @js.native
  open class SAT () extends StObject {
    
    /**
      * Returns true if the given convex polyhedra intersect. A polyhedron is just
      * an array of {@link Polygon} objects.
      *
      * @param polyhedronA - The first convex polyhedron.
      * @param polyhedronB - The second convex polyhedron.
      * @return Whether there is an intersection or not.
      */
    def intersects(polyhedronA: Polyhedron, polyhedronB: Polyhedron): Boolean = js.native
  }
}
