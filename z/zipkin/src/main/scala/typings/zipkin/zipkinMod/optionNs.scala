package typings.zipkin.zipkinMod

import typings.zipkin.zipkinMod.optionNs.INone
import typings.zipkin.zipkinMod.optionNs.IOption
import typings.zipkin.zipkinMod.optionNs.Option
import typings.zipkin.zipkinNumbers.`false`
import typings.zipkin.zipkinNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "option")
@js.native
object optionNs extends js.Object {
  @js.native
  trait INone[T]
    extends Option[T]
       with IOption[T] {
    val present: `false` = js.native
    val `type`: typings.zipkin.zipkinStrings.None = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.zipkin.zipkinMod.optionNs.Some[T]
    - typings.zipkin.zipkinMod.optionNs.INone[T]
  */
  trait IOption[T] extends js.Object
  
  @js.native
  abstract class Option[T] () extends js.Object {
    def equals(other: IOption[T]): Boolean = js.native
    def flatMap[V](fn: js.Function1[/* value */ T, IOption[V]]): IOption[V] = js.native
    def getOrElse(fnOrValue: T): T = js.native
    def getOrElse(fnOrValue: js.Function0[T]): T = js.native
    def ifPresent(fn: js.Function1[/* value */ T, _]): Unit = js.native
    def map[V](fn: js.Function1[/* value */ T, V]): IOption[V] = js.native
  }
  
  @js.native
  class Some[T] protected ()
    extends Option[T]
       with IOption[T] {
    def this(value: T) = this()
    val present: `true` = js.native
    val `type`: typings.zipkin.zipkinStrings.Some = js.native
  }
  
  val None: INone[scala.Nothing] = js.native
  def fromNullable[V](nullable: V): IOption[V] = js.native
  def isOptional(data: js.Any): Boolean = js.native
  def verifyIsOptional(data: js.Any): Unit = js.native
}

