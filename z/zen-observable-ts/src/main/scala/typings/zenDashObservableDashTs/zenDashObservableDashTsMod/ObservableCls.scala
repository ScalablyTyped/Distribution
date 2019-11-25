package typings.zenDashObservableDashTs.zenDashObservableDashTsMod

import typings.zenDashObservableDashTs.libZenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", "Observable")
@js.native
class ObservableCls[T] protected ()
  extends typings.zenDashObservableDashTs.libZenObservableMod.Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}

