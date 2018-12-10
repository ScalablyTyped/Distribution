package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "option")
@js.native
object optionNs extends js.Object {
  @js.native
  abstract class Option[T] ()
    extends zipkinLib.zipkinMod.zipkinNs.optionNs.Option[T]
  
  @js.native
  class Some[T] protected ()
    extends zipkinLib.zipkinMod.zipkinNs.optionNs.Some[T] {
    def this(value: T) = this()
  }
  
  val None: zipkinLib.zipkinMod.zipkinNs.optionNs.INone[scala.Nothing] = js.native
  def fromNullable[V](nullable: V): zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[V] = js.native
  def isOptional(data: js.Any): scala.Boolean = js.native
  def verifyIsOptional(data: js.Any): scala.Unit = js.native
}

