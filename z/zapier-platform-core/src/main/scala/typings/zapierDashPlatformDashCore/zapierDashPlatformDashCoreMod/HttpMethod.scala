package typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// internal only
// export const integrationTestHandler: () => any;
// export const createAppHandler: (appRaw: object) => any
/* Rewritten from type alias, can be one of: 
  - typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.GET
  - typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.POST
  - typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.PUT
  - typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.PATCH
  - typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.DELETE
  - typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.OPTIONS
  - typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.HEAD
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

