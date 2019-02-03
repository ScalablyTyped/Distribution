package typings
package zenDashObservableLib.zenDashObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable", JSImport.Namespace)
@js.native
class namespaced[T] protected () extends Observable[T] {
  def this(subscriber: zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs.Subscriber[T]) = this()
}

/* static members */
@JSImport("zen-observable", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def from[R](observable: stdLib.ArrayLike[R]): zenDashObservableLib.zenDashObservableMod.Observable[R] = js.native
  def from[R](observable: zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs.ObservableLike[R]): zenDashObservableLib.zenDashObservableMod.Observable[R] = js.native
  def from[R](observable: zenDashObservableLib.zenDashObservableMod.Observable[R]): zenDashObservableLib.zenDashObservableMod.Observable[R] = js.native
  def of[R](items: R*): zenDashObservableLib.zenDashObservableMod.Observable[R] = js.native
}

