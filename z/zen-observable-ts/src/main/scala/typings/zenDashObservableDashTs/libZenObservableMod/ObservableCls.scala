package typings.zenDashObservableDashTs.libZenObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts/lib/zenObservable", "Observable")
@js.native
class ObservableCls[T] protected () extends Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}

