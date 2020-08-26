package typings.zingchart.mod

import typings.zingchart.anon.Calloutoffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait refresh extends js.Object {
  /**
    * Enabling true will allow dynamic value range of the scale pertaining to the values. false (default) | true
    */
  var `adjust-scale`: js.UndefOr[Boolean] = js.native
  var curtain: js.UndefOr[Calloutoffset] = js.native
  /**
    * Sets the timeout between two refresh operations. If value is smaller than 50, seconds are assumed, otherwise milliseconds are assu
    * med. 5 | 10 | ...
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Sets the max amount of nodes visible in the graph. 5 | 10 | ...
    */
  var `max-ticks`: js.UndefOr[Double] = js.native
  /**
    * The number of nodes before starting the feed from 0 again. 500 | 1000 | ...
    */
  var `reset-timeout`: js.UndefOr[Double] = js.native
  /**
    * Defines the specific type of feed. http | js | websockets
    */
  var transport: js.UndefOr[String] = js.native
  /**
    * Sets the type of data refresh, full being the only option at loader's level. "full"
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The url path for the feed. feed() | https://myPhpFunction.php | wss://websockets.zingchart.com:8889
    */
  var url: js.UndefOr[String] = js.native
}

object refresh {
  @scala.inline
  def apply(): refresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[refresh]
  }
  @scala.inline
  implicit class refreshOps[Self <: refresh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAdjust-scale`(value: Boolean): Self = this.set("adjust-scale", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAdjust-scale`: Self = this.set("adjust-scale", js.undefined)
    @scala.inline
    def setCurtain(value: Calloutoffset): Self = this.set("curtain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurtain: Self = this.set("curtain", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def `setMax-ticks`(value: Double): Self = this.set("max-ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-ticks`: Self = this.set("max-ticks", js.undefined)
    @scala.inline
    def `setReset-timeout`(value: Double): Self = this.set("reset-timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteReset-timeout`: Self = this.set("reset-timeout", js.undefined)
    @scala.inline
    def setTransport(value: String): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

