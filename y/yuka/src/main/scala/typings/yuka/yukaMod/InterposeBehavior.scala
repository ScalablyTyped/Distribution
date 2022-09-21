package typings.yuka.yukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "InterposeBehavior")
@js.native
/**
  * Constructs a new interpose behavior.
  *
  * @param [entity1] - The first agent.
  * @param [entity2] - The second agent.
  * @param [deceleration] - The amount of deceleration.
  */
open class InterposeBehavior ()
  extends typings.yuka.interposeBehaviorMod.InterposeBehavior {
  def this(entity1: typings.yuka.movingEntityMod.MovingEntity) = this()
  def this(entity1: Unit, entity2: typings.yuka.movingEntityMod.MovingEntity) = this()
  def this(
    entity1: typings.yuka.movingEntityMod.MovingEntity,
    entity2: typings.yuka.movingEntityMod.MovingEntity
  ) = this()
  def this(entity1: Unit, entity2: Unit, deceleration: Double) = this()
  def this(entity1: Unit, entity2: typings.yuka.movingEntityMod.MovingEntity, deceleration: Double) = this()
  def this(entity1: typings.yuka.movingEntityMod.MovingEntity, entity2: Unit, deceleration: Double) = this()
  def this(
    entity1: typings.yuka.movingEntityMod.MovingEntity,
    entity2: typings.yuka.movingEntityMod.MovingEntity,
    deceleration: Double
  ) = this()
}
