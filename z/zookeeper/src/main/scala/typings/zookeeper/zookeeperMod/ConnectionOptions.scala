package typings.zookeeper.zookeeperMod

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
    debug_level: Int | Double = null,
    host_order_deterministic: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (!js.isUndefined(data_as_buffer)) __obj.updateDynamic("data_as_buffer")(data_as_buffer.asInstanceOf[js.Any])
    if (debug_level != null) __obj.updateDynamic("debug_level")(debug_level.asInstanceOf[js.Any])
    if (!js.isUndefined(host_order_deterministic)) __obj.updateDynamic("host_order_deterministic")(host_order_deterministic.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

