package typings.zeroclipboard.ZC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardConfig extends js.Object {
  /**
    * The class used to indicate that a clipped element is active (is being clicked).
    * @type {string}
    */
  var activeClass: js.UndefOr[String] = js.undefined
  /**
    * Setting this to `false` would allow users to handle calling `ZeroClipboard.focus(...);`
    * themselves instead of relying on our per-element `mouseover` handler.
    * @type {boolean}
    */
  var autoActivate: js.UndefOr[Boolean] = js.undefined
  /**
    * Bubble synthetic events in JavaScript after they are received by the Flash object.
    * @type {boolean}
    */
  var bubbleEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Include a "noCache" query parameter on requests for the SWF.
    * @type {boolean}
    */
  var cacheBust: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the class of the `div` encapsulating the Flash object.
    * @type {string}
    */
  var containerClass: js.UndefOr[String] = js.undefined
  /**
    * Sets the ID of the `div` encapsulating the Flash object.
    * Value is validated against the [HTML4 spec for `ID` tokens][valid_ids].
    * @type {string}
    */
  var containerId: js.UndefOr[String] = js.undefined
  /**
    * Ensure OS-compliant line endings, i.e. "\r\n" on Windows, "\n" elsewhere
    * @type {boolean}
    */
  var fixLineEndings: js.UndefOr[Boolean] = js.undefined
  /**
    * How many milliseconds to wait for the Flash SWF to load and respond before assuming that
    * Flash is deactivated (e.g. click-to-play) in the user's browser. If you don't care about
    * how long it takes to load the SWF, you can set this to `null`.
    * @type {number}
    */
  var flashLoadTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Enable use of the fancy "Desktop" clipboard, even on Linux where it is known to suck.
    * @type {boolean}
    */
  var forceEnhancedClipboard: js.UndefOr[Boolean] = js.undefined
  /**
    * Forcibly set the hand cursor ("pointer") for all clipped elements.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {boolean}
    */
  var forceHandCursor: js.UndefOr[Boolean] = js.undefined
  /**
    * The class used to indicate that a clipped element is being hovered over.
    * @type {string}
    */
  var hoverClass: js.UndefOr[String] = js.undefined
  /**
    * Sets the ID and name of the Flash `object` element.
    * Value is validated against the [HTML4 spec for `ID` and `Name` tokens][valid_ids].
    * @type {string}
    */
  var swfObjectId: js.UndefOr[String] = js.undefined
  /**
    * SWF URL, relative to the page. Default value will be "ZeroClipboard.swf" under the same path as the ZeroClipboard JS file.
    * @type {string}
    */
  var swfPath: js.UndefOr[String] = js.undefined
  /**
    * Sets the title of the `div` encapsulating the Flash object.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {string}
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * SWF inbound scripting policy: page domains that the SWF should trust. (single string, or array of strings)
    * @type {SingleOrList<string>}
    */
  var trustedDomains: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The z-index used by the Flash object.
    * Max value (32-bit): 2147483647.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {number}
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ZeroClipboardConfig {
  @scala.inline
  def apply(
    activeClass: String = null,
    autoActivate: js.UndefOr[Boolean] = js.undefined,
    bubbleEvents: js.UndefOr[Boolean] = js.undefined,
    cacheBust: js.UndefOr[Boolean] = js.undefined,
    containerClass: String = null,
    containerId: String = null,
    fixLineEndings: js.UndefOr[Boolean] = js.undefined,
    flashLoadTimeout: Int | Double = null,
    forceEnhancedClipboard: js.UndefOr[Boolean] = js.undefined,
    forceHandCursor: js.UndefOr[Boolean] = js.undefined,
    hoverClass: String = null,
    swfObjectId: String = null,
    swfPath: String = null,
    title: String = null,
    trustedDomains: js.Array[String] = null,
    zIndex: Int | Double = null
  ): ZeroClipboardConfig = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (!js.isUndefined(autoActivate)) __obj.updateDynamic("autoActivate")(autoActivate.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbleEvents)) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheBust)) __obj.updateDynamic("cacheBust")(cacheBust.asInstanceOf[js.Any])
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (!js.isUndefined(fixLineEndings)) __obj.updateDynamic("fixLineEndings")(fixLineEndings.asInstanceOf[js.Any])
    if (flashLoadTimeout != null) __obj.updateDynamic("flashLoadTimeout")(flashLoadTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(forceEnhancedClipboard)) __obj.updateDynamic("forceEnhancedClipboard")(forceEnhancedClipboard.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHandCursor)) __obj.updateDynamic("forceHandCursor")(forceHandCursor.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    if (swfObjectId != null) __obj.updateDynamic("swfObjectId")(swfObjectId.asInstanceOf[js.Any])
    if (swfPath != null) __obj.updateDynamic("swfPath")(swfPath.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trustedDomains != null) __obj.updateDynamic("trustedDomains")(trustedDomains.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeroClipboardConfig]
  }
}

