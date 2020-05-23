package typings.zookeeper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var connect: js.UndefOr[String] = js.undefined
  var data_as_buffer: js.UndefOr[Boolean] = js.undefined
  var debug_level: js.UndefOr[Double] = js.undefined
  var host_order_deterministic: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    connect: String = null,
    data_as_buffer: js.UndefOr[Boolean] = js.undefined,
    debug_level: js.UndefOr[Double] = js.undefined,
    host_order_deterministic: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (!js.isUndefined(data_as_buffer)) __obj.updateDynamic("data_as_buffer")(data_as_buffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug_level)) __obj.updateDynamic("debug_level")(debug_level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(host_order_deterministic)) __obj.updateDynamic("host_order_deterministic")(host_order_deterministic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

