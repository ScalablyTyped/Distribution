package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.srcNavigationNavmeshNavMeshMod.NavMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNavigationNavmeshCostTableMod {
  
  @JSImport("yuka/src/navigation/navmesh/CostTable", "CostTable")
  @js.native
  /**
    * Creates a new cost table.
    */
  open class CostTable () extends StObject {
    
    /**
      * Clears the cost table.
      */
    def clear(): this.type = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Returns the cost for the given pair of navigation nodes.
      *
      * @param from - The start node index.
      * @param to - The destintation node index.
      */
    def get(from: Double, to: Double): Double = js.native
    
    /**
      * Inits the cost table for the given navigation mesh.
      *
      * @param navMesh - The navigation mesh.
      */
    def init(navMesh: NavMesh): this.type = js.native
    
    /**
      * Sets the cost for the given pair of navigation nodes.
      *
      * @param from - The start node index.
      * @param to - The destintation node index.
      * @param cost - The cost.
      */
    def set(from: Double, to: Double, cost: Double): this.type = js.native
    
    /**
      * Returns the size of the cost table (amount of entries).
      */
    def size(): Double = js.native
    
    /**
      * Transforms this instance into a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
