package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardStatic
  extends ZeroClipboardCommon
     with ScalablyTyped.runtime.Instantiable1[
      (/* elements */ stdLib.Element) | (/* elements */ List[stdLib.Element]), 
      ZeroClipboardClient
    ]
     with ScalablyTyped.runtime.Instantiable0[ZeroClipboardClient] {
  /**
       * The version of the ZeroClipboard library being used, e.g. "2.0.0".
       * @type {string}
       */
  var version: java.lang.String = js.native
  /**
       * Focus/"activate" the provided element by moving the Flash SWF object in front of it.
       * @param {Element} element
       * @deprecated: The preferred method to use is focus but the alias activate is available for backward compatibility's sake.
       */
  def activate(element: stdLib.Element): scala.Unit = js.native
  /**
       * Return the currently "activated" element that the Flash SWF object is in front of it.
       * @return {HTMLElement} or {null}
       */
  def activeElement(): stdLib.HTMLElement = js.native
  /**
       * Blur/"deactivate" the currently focused/"activated" element, moving the Flash SWF object off the screen.
       * @since 2.1.0
       */
  def blur(): scala.Unit = js.native
  /**
       * Get a copy of the active configuration for ZeroClipboard.
       * @return {ZeroClipboardConfig}
       */
  def config(): ZeroClipboardConfig = js.native
  /**
       * Set the active configuration for ZeroClipboard. Returns a copy of the updated active configuration.
       * @param  {ZeroClipboardConfig} config
       * @return {ZeroClipboardConfig}
       */
  def config(config: ZeroClipboardConfig): ZeroClipboardConfig = js.native
  /**
       *  Get a copy of the actively configured value for this configuration property for ZeroClipboard.
       * @param  {string} propName
       * @return {any}
       */
  def config(propName: java.lang.String): js.Any = js.native
  @JSName("config")
  def config_activeClass(propName: zeroclipboardLib.zeroclipboardLibStrings.activeClass): java.lang.String = js.native
  @JSName("config")
  def config_autoActivate(propName: zeroclipboardLib.zeroclipboardLibStrings.autoActivate): scala.Boolean = js.native
  @JSName("config")
  def config_bubbleEvents(propName: zeroclipboardLib.zeroclipboardLibStrings.bubbleEvents): scala.Boolean = js.native
  @JSName("config")
  def config_cacheBust(propName: zeroclipboardLib.zeroclipboardLibStrings.cacheBust): scala.Boolean = js.native
  @JSName("config")
  def config_containerClass(propName: zeroclipboardLib.zeroclipboardLibStrings.containerClass): java.lang.String = js.native
  @JSName("config")
  def config_containerId(propName: zeroclipboardLib.zeroclipboardLibStrings.containerId): java.lang.String = js.native
  @JSName("config")
  def config_fixLineEndings(propName: zeroclipboardLib.zeroclipboardLibStrings.fixLineEndings): scala.Boolean = js.native
  @JSName("config")
  def config_flashLoadTimeout(propName: zeroclipboardLib.zeroclipboardLibStrings.flashLoadTimeout): scala.Double = js.native
  @JSName("config")
  def config_forceEnhancedClipboard(propName: zeroclipboardLib.zeroclipboardLibStrings.forceEnhancedClipboard): scala.Boolean = js.native
  @JSName("config")
  def config_forceHandCursor(propName: zeroclipboardLib.zeroclipboardLibStrings.forceHandCursor): scala.Boolean = js.native
  @JSName("config")
  def config_hoverClass(propName: zeroclipboardLib.zeroclipboardLibStrings.hoverClass): java.lang.String = js.native
  @JSName("config")
  def config_swfObjectId(propName: zeroclipboardLib.zeroclipboardLibStrings.swfObjectId): java.lang.String = js.native
  @JSName("config")
  def config_swfPath(propName: zeroclipboardLib.zeroclipboardLibStrings.swfPath): java.lang.String = js.native
  @JSName("config")
  def config_title(propName: zeroclipboardLib.zeroclipboardLibStrings.title): java.lang.String = js.native
  @JSName("config")
  def config_trustedDomains(propName: zeroclipboardLib.zeroclipboardLibStrings.trustedDomains): js.Array[java.lang.String] = js.native
  @JSName("config")
  def config_zIndex(propName: zeroclipboardLib.zeroclipboardLibStrings.zIndex): scala.Double = js.native
  /**
       * Create the Flash bridge SWF object.
       * IMPORTANT: This method should be considered private.
       * @private
       */
  def create(): scala.Unit = js.native
  /**
       * Blur/"deactivate" the currently focused/"activated" element, moving the Flash SWF object off the screen.
       * @deprecated: The preferred method to use is blur but the alias deactivate is available for backward compatibility's sake.
       */
  def deactivate(): scala.Unit = js.native
  /**
       * Emit the "destroy" event, remove all event handlers, and destroy the Flash bridge.
       */
  def destroy(): scala.Unit = js.native
  /**
       * Focus/"activate" the provided element by moving the Flash SWF object in front of it.
       * @param {Element} element
       * @since 2.1.0
       */
  def focus(element: stdLib.Element): scala.Unit = js.native
  /**
       * Indicates if Flash Player is definitely unusable (disabled, outdated, unavailable, or deactivated).
       * IMPORTANT: This method should be considered private.
       * @return {boolean}
       * @private
       */
  def isFlashUnusable(): scala.Boolean = js.native
  /**
       * Diagnostic method that describes the state of the browser, Flash Player, and ZeroClipboard.
       * @return {Object}
       */
  def state(): js.Object = js.native
}

