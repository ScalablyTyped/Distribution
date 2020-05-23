package typings.zingchart.mod

import typings.zingchart.anon.Calloutoffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait refresh extends js.Object {
  /**
    * Enabling true will allow dynamic value range of the scale pertaining to the values. false (default) | true
    */
  var `adjust-scale`: js.UndefOr[Boolean] = js.undefined
  var curtain: js.UndefOr[Calloutoffset] = js.undefined
  /**
    * Sets the timeout between two refresh operations. If value is smaller than 50, seconds are assumed, otherwise milliseconds are assu
    * med. 5 | 10 | ...
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * Sets the max amount of nodes visible in the graph. 5 | 10 | ...
    */
  var `max-ticks`: js.UndefOr[Double] = js.undefined
  /**
    * The number of nodes before starting the feed from 0 again. 500 | 1000 | ...
    */
  var `reset-timeout`: js.UndefOr[Double] = js.undefined
  /**
    * Defines the specific type of feed. http | js | websockets
    */
  var transport: js.UndefOr[String] = js.undefined
  /**
    * Sets the type of data refresh, full being the only option at loader's level. "full"
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The url path for the feed. feed() | https://myPhpFunction.php | wss://websockets.zingchart.com:8889
    */
  var url: js.UndefOr[String] = js.undefined
}

object refresh {
  @scala.inline
  def apply(
    `adjust-scale`: js.UndefOr[Boolean] = js.undefined,
    curtain: Calloutoffset = null,
    interval: js.UndefOr[Double] = js.undefined,
    `max-ticks`: js.UndefOr[Double] = js.undefined,
    `reset-timeout`: js.UndefOr[Double] = js.undefined,
    transport: String = null,
    `type`: String = null,
    url: String = null
  ): refresh = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`adjust-scale`)) __obj.updateDynamic("adjust-scale")(`adjust-scale`.get.asInstanceOf[js.Any])
    if (curtain != null) __obj.updateDynamic("curtain")(curtain.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`max-ticks`)) __obj.updateDynamic("max-ticks")(`max-ticks`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`reset-timeout`)) __obj.updateDynamic("reset-timeout")(`reset-timeout`.get.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[refresh]
  }
}

