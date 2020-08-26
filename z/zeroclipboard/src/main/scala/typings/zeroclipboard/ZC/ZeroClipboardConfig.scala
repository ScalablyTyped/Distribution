package typings.zeroclipboard.ZC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardConfig extends js.Object {
  /**
    * The class used to indicate that a clipped element is active (is being clicked).
    * @type {string}
    */
  var activeClass: js.UndefOr[String] = js.native
  /**
    * Setting this to `false` would allow users to handle calling `ZeroClipboard.focus(...);`
    * themselves instead of relying on our per-element `mouseover` handler.
    * @type {boolean}
    */
  var autoActivate: js.UndefOr[Boolean] = js.native
  /**
    * Bubble synthetic events in JavaScript after they are received by the Flash object.
    * @type {boolean}
    */
  var bubbleEvents: js.UndefOr[Boolean] = js.native
  /**
    * Include a "noCache" query parameter on requests for the SWF.
    * @type {boolean}
    */
  var cacheBust: js.UndefOr[Boolean] = js.native
  /**
    * Sets the class of the `div` encapsulating the Flash object.
    * @type {string}
    */
  var containerClass: js.UndefOr[String] = js.native
  /**
    * Sets the ID of the `div` encapsulating the Flash object.
    * Value is validated against the [HTML4 spec for `ID` tokens][valid_ids].
    * @type {string}
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * Ensure OS-compliant line endings, i.e. "\r\n" on Windows, "\n" elsewhere
    * @type {boolean}
    */
  var fixLineEndings: js.UndefOr[Boolean] = js.native
  /**
    * How many milliseconds to wait for the Flash SWF to load and respond before assuming that
    * Flash is deactivated (e.g. click-to-play) in the user's browser. If you don't care about
    * how long it takes to load the SWF, you can set this to `null`.
    * @type {number}
    */
  var flashLoadTimeout: js.UndefOr[Double] = js.native
  /**
    * Enable use of the fancy "Desktop" clipboard, even on Linux where it is known to suck.
    * @type {boolean}
    */
  var forceEnhancedClipboard: js.UndefOr[Boolean] = js.native
  /**
    * Forcibly set the hand cursor ("pointer") for all clipped elements.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {boolean}
    */
  var forceHandCursor: js.UndefOr[Boolean] = js.native
  /**
    * The class used to indicate that a clipped element is being hovered over.
    * @type {string}
    */
  var hoverClass: js.UndefOr[String] = js.native
  /**
    * Sets the ID and name of the Flash `object` element.
    * Value is validated against the [HTML4 spec for `ID` and `Name` tokens][valid_ids].
    * @type {string}
    */
  var swfObjectId: js.UndefOr[String] = js.native
  /**
    * SWF URL, relative to the page. Default value will be "ZeroClipboard.swf" under the same path as the ZeroClipboard JS file.
    * @type {string}
    */
  var swfPath: js.UndefOr[String] = js.native
  /**
    * Sets the title of the `div` encapsulating the Flash object.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {string}
    */
  var title: js.UndefOr[String] = js.native
  /**
    * SWF inbound scripting policy: page domains that the SWF should trust. (single string, or array of strings)
    * @type {SingleOrList<string>}
    */
  var trustedDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * The z-index used by the Flash object.
    * Max value (32-bit): 2147483647.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {number}
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object ZeroClipboardConfig {
  @scala.inline
  def apply(): ZeroClipboardConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeroClipboardConfig]
  }
  @scala.inline
  implicit class ZeroClipboardConfigOps[Self <: ZeroClipboardConfig] (val x: Self) extends AnyVal {
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
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    @scala.inline
    def setAutoActivate(value: Boolean): Self = this.set("autoActivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoActivate: Self = this.set("autoActivate", js.undefined)
    @scala.inline
    def setBubbleEvents(value: Boolean): Self = this.set("bubbleEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleEvents: Self = this.set("bubbleEvents", js.undefined)
    @scala.inline
    def setCacheBust(value: Boolean): Self = this.set("cacheBust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheBust: Self = this.set("cacheBust", js.undefined)
    @scala.inline
    def setContainerClass(value: String): Self = this.set("containerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClass: Self = this.set("containerClass", js.undefined)
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setFixLineEndings(value: Boolean): Self = this.set("fixLineEndings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixLineEndings: Self = this.set("fixLineEndings", js.undefined)
    @scala.inline
    def setFlashLoadTimeout(value: Double): Self = this.set("flashLoadTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashLoadTimeout: Self = this.set("flashLoadTimeout", js.undefined)
    @scala.inline
    def setForceEnhancedClipboard(value: Boolean): Self = this.set("forceEnhancedClipboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceEnhancedClipboard: Self = this.set("forceEnhancedClipboard", js.undefined)
    @scala.inline
    def setForceHandCursor(value: Boolean): Self = this.set("forceHandCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceHandCursor: Self = this.set("forceHandCursor", js.undefined)
    @scala.inline
    def setHoverClass(value: String): Self = this.set("hoverClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverClass: Self = this.set("hoverClass", js.undefined)
    @scala.inline
    def setSwfObjectId(value: String): Self = this.set("swfObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwfObjectId: Self = this.set("swfObjectId", js.undefined)
    @scala.inline
    def setSwfPath(value: String): Self = this.set("swfPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwfPath: Self = this.set("swfPath", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrustedDomainsVarargs(value: String*): Self = this.set("trustedDomains", js.Array(value :_*))
    @scala.inline
    def setTrustedDomains(value: js.Array[String]): Self = this.set("trustedDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustedDomains: Self = this.set("trustedDomains", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

