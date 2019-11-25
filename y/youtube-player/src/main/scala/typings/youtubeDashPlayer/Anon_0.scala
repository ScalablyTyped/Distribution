package typings.youtubeDashPlayer

import typings.youtubeDashPlayer.youtubeDashPlayerNumbers.`0`
import typings.youtubeDashPlayer.youtubeDashPlayerNumbers.`1`
import typings.youtubeDashPlayer.youtubeDashPlayerNumbers.`3`
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.playlist
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.red
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.search
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.user_uploads
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var autoplay: js.UndefOr[`0` | `1`] = js.undefined
  var cc_lang_pref: js.UndefOr[String] = js.undefined
  var cc_load_policy: js.UndefOr[`1`] = js.undefined
  var color: js.UndefOr[red | white] = js.undefined
  var controls: js.UndefOr[`0` | `1`] = js.undefined
  var disablekb: js.UndefOr[`0` | `1`] = js.undefined
  var enablejsapi: js.UndefOr[`0` | `1`] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var fs: js.UndefOr[`0` | `1`] = js.undefined
  var hl: js.UndefOr[String] = js.undefined
  var iv_load_policy: js.UndefOr[`1` | `3`] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var listType: js.UndefOr[playlist | search | user_uploads] = js.undefined
  var loop: js.UndefOr[`0` | `1`] = js.undefined
  var modestbranding: js.UndefOr[`1`] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var playlist: js.UndefOr[String] = js.undefined
  var playsinline: js.UndefOr[`0` | `1`] = js.undefined
  var rel: js.UndefOr[`0` | `1`] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var widget_referrer: js.UndefOr[String] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(
    autoplay: `0` | `1` = null,
    cc_lang_pref: String = null,
    cc_load_policy: `1` = null,
    color: red | white = null,
    controls: `0` | `1` = null,
    disablekb: `0` | `1` = null,
    enablejsapi: `0` | `1` = null,
    end: Int | Double = null,
    fs: `0` | `1` = null,
    hl: String = null,
    iv_load_policy: `1` | `3` = null,
    list: String = null,
    listType: playlist | search | user_uploads = null,
    loop: `0` | `1` = null,
    modestbranding: `1` = null,
    origin: String = null,
    playlist: String = null,
    playsinline: `0` | `1` = null,
    rel: `0` | `1` = null,
    start: Int | Double = null,
    widget_referrer: String = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal()
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (cc_lang_pref != null) __obj.updateDynamic("cc_lang_pref")(cc_lang_pref.asInstanceOf[js.Any])
    if (cc_load_policy != null) __obj.updateDynamic("cc_load_policy")(cc_load_policy.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (disablekb != null) __obj.updateDynamic("disablekb")(disablekb.asInstanceOf[js.Any])
    if (enablejsapi != null) __obj.updateDynamic("enablejsapi")(enablejsapi.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (iv_load_policy != null) __obj.updateDynamic("iv_load_policy")(iv_load_policy.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (modestbranding != null) __obj.updateDynamic("modestbranding")(modestbranding.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (playlist != null) __obj.updateDynamic("playlist")(playlist.asInstanceOf[js.Any])
    if (playsinline != null) __obj.updateDynamic("playsinline")(playsinline.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (widget_referrer != null) __obj.updateDynamic("widget_referrer")(widget_referrer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

