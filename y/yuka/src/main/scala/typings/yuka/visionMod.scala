package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.gameEntityMod.GameEntity
import typings.yuka.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visionMod {
  
  @JSImport("yuka/src/perception/vision/Vision", "Vision")
  @js.native
  /**
    * Constructs a new vision object.
    *
    * @param [owner=null] - The owner of this vision instance.
    */
  open class Vision () extends StObject {
    def this(owner: GameEntity) = this()
    
    /**
      * Adds an obstacle to this vision instance.
      *
      * @param obstacle - The obstacle to add.
      */
    def addObstacle(obstacle: GameEntity): this.type = js.native
    
    /**
      * The field of view in radians.
      * @default π
      */
    var fieldOfView: Double = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * An array of obstacles. An obstacle is a game entity that
      * implements the {@link GameEntity#lineOfSightTest} method.
      */
    var obstacles: js.Array[GameEntity] = js.native
    
    /**
      * The game entity that owns this vision instance.
      */
    var owner: GameEntity | Null = js.native
    
    /**
      * The visual range in world units.
      * @default Infinity
      */
    var range: Double = js.native
    
    /**
      * Removes an obstacle from this vision instance.
      *
      * @param obstacle - The obstacle to remove.
      */
    def removeObstacle(obstacle: GameEntity): this.type = js.native
    
    /**
      * Restores UUIDs with references to GameEntity objects.
      *
      * @param entities - Maps game entities to UUIDs.
      */
    def resolveReferences(entities: Map[String, GameEntity]): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /**
      * Performs a line of sight test in order to determine if the given point
      * in 3D space is visible for the game entity.
      *
      * @param point - The point to test.
      * @return Whether the given point is visible or not.
      */
    def visible(point: Vector3): Boolean = js.native
  }
}
