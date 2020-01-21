package typings.zapierPlatformCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// internal only
// export const integrationTestHandler: () => any;
// export const createAppHandler: (appRaw: object) => any
/* Rewritten from type alias, can be one of: 
  - typings.zapierPlatformCore.zapierPlatformCoreStrings.GET
  - typings.zapierPlatformCore.zapierPlatformCoreStrings.POST
  - typings.zapierPlatformCore.zapierPlatformCoreStrings.PUT
  - typings.zapierPlatformCore.zapierPlatformCoreStrings.PATCH
  - typings.zapierPlatformCore.zapierPlatformCoreStrings.DELETE
  - typings.zapierPlatformCore.zapierPlatformCoreStrings.OPTIONS
  - typings.zapierPlatformCore.zapierPlatformCoreStrings.HEAD
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typings.zapierPlatformCore.zapierPlatformCoreStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.zapierPlatformCore.zapierPlatformCoreStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.zapierPlatformCore.zapierPlatformCoreStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typings.zapierPlatformCore.zapierPlatformCoreStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typings.zapierPlatformCore.zapierPlatformCoreStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.zapierPlatformCore.zapierPlatformCoreStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.zapierPlatformCore.zapierPlatformCoreStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

