package typings.zchatBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.zchatBrowser.zchatBrowserStrings.NOT_SUPPORTED
  - typings.zchatBrowser.zchatBrowserStrings.NOT_ALLOWED
  - typings.zchatBrowser.zchatBrowserStrings.CONN_ERROR
  - typings.zchatBrowser.zchatBrowserStrings.INVALID_EXTENSION
  - typings.zchatBrowser.zchatBrowserStrings.EXCEED_SIZE_LIMIT
  - typings.zchatBrowser.zchatBrowserStrings.INTERNAL_ERROR
  - typings.zchatBrowser.zchatBrowserStrings.UNKNOWN_ERROR
*/
trait SendFileErrorMessage extends js.Object

object SendFileErrorMessage {
  @scala.inline
  def CONN_ERROR: typings.zchatBrowser.zchatBrowserStrings.CONN_ERROR = this.cast("CONN_ERROR")
  @scala.inline
  def EXCEED_SIZE_LIMIT: typings.zchatBrowser.zchatBrowserStrings.EXCEED_SIZE_LIMIT = this.cast("EXCEED_SIZE_LIMIT")
  @scala.inline
  def INTERNAL_ERROR: typings.zchatBrowser.zchatBrowserStrings.INTERNAL_ERROR = this.cast("INTERNAL_ERROR")
  @scala.inline
  def INVALID_EXTENSION: typings.zchatBrowser.zchatBrowserStrings.INVALID_EXTENSION = this.cast("INVALID_EXTENSION")
  @scala.inline
  def NOT_ALLOWED: typings.zchatBrowser.zchatBrowserStrings.NOT_ALLOWED = this.cast("NOT_ALLOWED")
  @scala.inline
  def NOT_SUPPORTED: typings.zchatBrowser.zchatBrowserStrings.NOT_SUPPORTED = this.cast("NOT_SUPPORTED")
  @scala.inline
  def UNKNOWN_ERROR: typings.zchatBrowser.zchatBrowserStrings.UNKNOWN_ERROR = this.cast("UNKNOWN_ERROR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

