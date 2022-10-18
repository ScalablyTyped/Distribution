package typings.yuka

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.srcCoreEntityManagerMod.EntityManager
import typings.yuka.srcCoreTelegramMod.Telegram
import typings.yuka.srcMathMatrix4Mod.Matrix4
import typings.yuka.srcMathQuaternionMod.Quaternion
import typings.yuka.srcMathRayMod.Ray
import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreGameEntityMod {
  
  @JSImport("yuka/src/core/GameEntity", "GameEntity")
  @js.native
  /**
    * Constructs a new game entity.
    */
  open class GameEntity () extends StObject {
    
    /**
      * Whether this game entity is active or not.
      * @default true
      */
    var active: Boolean = js.native
    
    /**
      * Adds a game entity as a child to this game entity.
      *
      * @param entity - The game entity to add.
      */
    def add(entity: GameEntity): this.type = js.native
    
    /**
      * The bounding radius of this game entity in world units.
      * @default 0
      */
    var boundingRadius: Double = js.native
    
    /**
      * Whether the entity can activate a trigger or not.
      * @default true
      */
    var canActivateTrigger: Boolean = js.native
    
    /**
      * The child entities of this game entity.
      */
    var children: js.Array[GameEntity] = js.native
    
    /**
      * The default forward vector of this game entity.
      * @default Vector3(0,0,1)
      */
    var forward: Vector3 = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Computes the current direction (forward) vector of this game entity
      * and stores the result in the given vector.
      *
      * @param result - The direction vector of this game entity.
      * @return The direction vector of this game entity.
      */
    def getDirection(result: Vector3): Vector3 = js.native
    
    /**
      * Computes the current direction (forward) vector of this game entity
      * in world space and stores the result in the given vector.
      *
      * @param result - The direction vector of this game entity in world space.
      * @return The direction vector of this game entity in world space.
      */
    def getWorldDirection(result: Vector3): Vector3 = js.native
    
    /**
      * Computes the current position of this game entity in world space and
      * stores the result in the given vector.
      *
      * @param result - The position of this game entity in world space.
      * @return The position of this game entity in world space.
      */
    def getWorldPosition(result: Vector3): Vector3 = js.native
    
    /**
      * Holds the implementation for the message handling of this game entity.
      *
      * @param telegram - The telegram with the message data.
      * @return Whether the message was processed or not.
      */
    def handleMessage(telegram: Telegram): Boolean = js.native
    
    /**
      * Holds the implementation for the line of sight test of this game entity.
      * This method is used by {@link Vision#visible} in order to determine whether
      * this game entity blocks the given line of sight or not. Implement this method
      * when your game entity acts as an obstacle.
      *
      * @param ray - The ray that represents the line of sight.
      * @param intersectionPoint - The intersection point.
      * @return The intersection point.
      */
    def lineOfSightTest(ray: Ray, intersectionPoint: Vector3): Vector3 | Null = js.native
    
    /**
      * Directly rotates the entity so it faces the given target position.
      *
      * @param target - The target position.
      */
    def lookAt(target: Vector3): this.type = js.native
    
    /**
      * A reference to the entity manager of this game entity.
      * Automatically set when added to an {@link EntityManager}.
      * @default null
      */
    val manager: EntityManager | Null = js.native
    
    /**
      * The maximum turn rate of this game entity in radians per seconds.
      * @default π
      */
    var maxTurnRate: Double = js.native
    
    /**
      * The name of this game entity.
      * @default ''
      */
    var name: String = js.native
    
    /**
      * Game entities within this radius are considered as neighbors of this entity.
      * @default 1
      */
    var neighborhoodRadius: Double = js.native
    
    /**
      * A list of neighbors of this game entity.
      */
    val neighbors: js.Array[GameEntity] = js.native
    
    /**
      * A reference to the parent entity of this game entity.
      * Automatically set when added to a {@link GameEntity}.
      * @default null
      */
    val parent: GameEntity | Null = js.native
    
    /**
      * The position of this game entity.
      */
    var position: Vector3 = js.native
    
    /**
      * Removes a game entity as a child from this game entity.
      *
      * @param entity - The game entity to remove.
      */
    def remove(entity: GameEntity): this.type = js.native
    
    /**
      * Restores UUIDs with references to GameEntity objects.
      *
      * @param entities - Maps game entities to UUIDs.
      */
    def resolveReferences(entities: Map[String, GameEntity]): this.type = js.native
    
    /**
      * Given a target position, this method rotates the entity by an amount not
      * greater than {@link GameEntity#maxTurnRate} until it directly faces the target.
      *
      * @param target - The target position.
      * @param delta - The time delta.
      * @param tolerance - A tolerance value in radians to tweak the result when a game entity is considered to face a target.
      * @return Whether the entity is faced to the target or not.
      */
    def rotateTo(target: Vector3, delta: Double): Boolean = js.native
    def rotateTo(target: Vector3, delta: Double, tolerance: Double): Boolean = js.native
    
    /**
      * The rotation of this game entity.
      */
    var rotation: Quaternion = js.native
    
    /**
      * The scaling of this game entity.
      * @default Vector3(1, 1, 1)
      */
    var scale: Vector3 = js.native
    
    /**
      * Sends a message with the given data to the specified receiver.
      *
      * @param receiver - The receiver.
      * @param message - The actual message.
      * @param delay - A time value in millisecond used to delay the message dispatching.
      * @param data - An object for custom data.
      */
    def sendMessage(receiver: GameEntity, message: String): this.type = js.native
    def sendMessage(receiver: GameEntity, message: String, delay: Double): this.type = js.native
    def sendMessage(receiver: GameEntity, message: String, delay: Double, data: js.Object): this.type = js.native
    def sendMessage(receiver: GameEntity, message: String, delay: Unit, data: js.Object): this.type = js.native
    
    /**
      * Sets a renderable component of a 3D engine with a sync callback for this game entity.
      *
      * @param renderComponent - A renderable component of a 3D engine.
      * @param callback - A callback that can be used to sync this game entity with the renderable component.
      */
    def setRenderComponent[ComponentType](renderComponent: ComponentType, callback: RenderCallback[ComponentType]): this.type = js.native
    
    /**
      * Executed when this game entity is updated for the first time by its {@link EntityManager}.
      */
    def start(): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /**
      * The default up vector of this game entity.
      * @default Vector3(0,1,0)
      */
    var up: Vector3 = js.native
    
    /**
      * Updates the internal state of this game entity. Normally called by {@link EntityManager#update}
      * in each simulation step.
      *
      * @param delta - The time delta.
      */
    def update(delta: Double): this.type = js.native
    
    /**
      * Whether the neighborhood of this game entity is updated or not.
      * @default false
      */
    var updateNeighborhood: Boolean = js.native
    
    /**
      * @deprecated GameEntity.updateWorldMatrix() has been removed. World matrices are automatically updated on access.
      */
    def updateWorldMatrix(): Unit = js.native
    
    /**
      * Unique ID, primarily used in context of serialization/deserialization.
      */
    def uuid: String = js.native
    
    /**
      * A transformation matrix representing the world space of this game entity.
      */
    def worldMatrix: Matrix4 = js.native
  }
  
  @js.native
  trait GameEntityConstructor
    extends StObject
       with Instantiable0[GameEntity]
  
  type RenderCallback[ComponentType] = js.Function2[/* entity */ GameEntity, /* renderComponent */ ComponentType, Unit]
}
