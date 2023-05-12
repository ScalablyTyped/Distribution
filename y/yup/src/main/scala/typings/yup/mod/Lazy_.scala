package typings.yup.mod

import typings.std.Record
import typings.yup.anon.PartialLazySpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lazy_[T, TContext, TFlags /* <: Flags */]
  extends StObject
     with ISchema[T, TContext, TFlags, Unit] {
  
  var __isYupSchema__ : Boolean = js.native
  
  /* private */ var _resolve: Any = js.native
  
  /* private */ var builder: Any = js.native
  
  @JSName("cast")
  def cast_Union(value: Any): js.UndefOr[T | Null] = js.native
  
  def clone(spec: PartialLazySpec): Lazy_[T, TContext, TFlags] = js.native
  
  def isValid(value: Any): js.Promise[Boolean] = js.native
  def isValid(value: Any, options: ValidateOptions[TContext]): js.Promise[Boolean] = js.native
  
  def isValidSync(value: Any): Boolean = js.native
  def isValidSync(value: Any, options: ValidateOptions[TContext]): Boolean = js.native
  
  def meta(): js.UndefOr[Record[String, Any]] = js.native
  def meta(obj: Record[String, Any]): Lazy_[T, TContext, TFlags] = js.native
  
  def optional(): Lazy_[js.UndefOr[T], TContext, TFlags] = js.native
  
  /* private */ var optionality: Any = js.native
  
  var spec: LazySpec = js.native
  
  var `type`: typings.yup.yupStrings.`lazy` = js.native
  
  def validateAt(path: String, value: Any): js.Promise[Any] = js.native
  def validateAt(path: String, value: Any, options: ValidateOptions[TContext]): js.Promise[Any] = js.native
  
  def validateSync(value: Any): T = js.native
  def validateSync(value: Any, options: ValidateOptions[TContext]): T = js.native
  
  def validateSyncAt(path: String, value: Any): Any = js.native
  def validateSyncAt(path: String, value: Any, options: ValidateOptions[TContext]): Any = js.native
}
