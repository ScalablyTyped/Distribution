package typings.ziggyJs.mod

import typings.std.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ziggy-js", "Router")
@js.native
class Router () extends String {
  
  def check(name: java.lang.String): Boolean = js.native
  
  def constructQuery(): java.lang.String = js.native
  
  def current(): Route = js.native
  def current(name: java.lang.String): Route = js.native
  
  def extractParams(uri: java.lang.String, template: java.lang.String, delimiter: java.lang.String): NormalizedParams = js.native
  
  def hydrateUrl(): java.lang.String = js.native
  
  def matchUrl(): Boolean = js.native
  
  def normalizeParams(params: InputParams): NormalizedParams = js.native
  
  def params: NormalizedParams = js.native
  
  def parse(): Unit = js.native
  
  def trimParam(param: java.lang.String): java.lang.String = js.native
  
  def url(): java.lang.String = js.native
  
  def `with`(params: InputParams): Router = js.native
  
  def withQuery(params: InputParams): Router = js.native
}
