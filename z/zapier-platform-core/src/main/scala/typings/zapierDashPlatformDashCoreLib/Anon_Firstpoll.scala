package typings
package zapierDashPlatformDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Firstpoll extends js.Object {
  var first_poll: scala.Boolean
  var frontend: scala.Boolean
  var hydrate: scala.Boolean
  var limit: scala.Double
  var page: scala.Double
  var prefill: scala.Boolean
  var standard_poll: scala.Boolean
  var test_poll: scala.Boolean
  var zap: js.UndefOr[Anon_Id] = js.undefined
}

object Anon_Firstpoll {
  @scala.inline
  def apply(
    first_poll: scala.Boolean,
    frontend: scala.Boolean,
    hydrate: scala.Boolean,
    limit: scala.Double,
    page: scala.Double,
    prefill: scala.Boolean,
    standard_poll: scala.Boolean,
    test_poll: scala.Boolean,
    zap: Anon_Id = null
  ): Anon_Firstpoll = {
    val __obj = js.Dynamic.literal(first_poll = first_poll, frontend = frontend, hydrate = hydrate, limit = limit, page = page, prefill = prefill, standard_poll = standard_poll, test_poll = test_poll)
    if (zap != null) __obj.updateDynamic("zap")(zap)
    __obj.asInstanceOf[Anon_Firstpoll]
  }
}

