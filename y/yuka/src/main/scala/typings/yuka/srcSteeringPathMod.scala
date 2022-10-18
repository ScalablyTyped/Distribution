package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSteeringPathMod {
  
  @JSImport("yuka/src/steering/Path", "Path")
  @js.native
  /**
    * Constructs a new path.
    */
  open class Path () extends StObject {
    
    /**
      * Adds the given waypoint to this path.
      *
      * @param waypoint - The waypoint to add.
      */
    def add(waypoint: Vector3): this.type = js.native
    
    /**
      * Makes the next waypoint of this path active. If the path is looped and
      * {@link Path#finished} returns true, the path starts from the beginning.
      */
    def advance(): this.type = js.native
    
    /**
      * Clears the internal state of this path.
      */
    def clear(): this.type = js.native
    
    /**
      * Returns the current active waypoint of this path.
      */
    def current(): Vector3 = js.native
    
    /**
      * Returns true if this path is not looped and the last waypoint is active.
      *
      * @return Whether this path is finished or not.
      */
    def finished(): Boolean = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Whether this path is looped or not.
      * @default false
      */
    var loop: Boolean = js.native
    
    /**
      * Transforms this instance into a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
