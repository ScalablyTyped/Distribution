package typings
package zenDashObservableLib.zenDashObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable", JSImport.Namespace)
@js.native
class ^[T] protected () extends Observable[T] {
  def this(subscriber: zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs.Subscriber[T]) = this()
}

@JSImport("zen-observable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def from[R](observable: stdLib.ArrayLike[R]): Observable[R] = js.native
  def from[R](observable: zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs.ObservableLike[R]): Observable[R] = js.native
  def from[R](observable: Observable[R]): Observable[R] = js.native
  def of[R](items: R*): Observable[R] = js.native
}

