package typings
package yog2DashKernelLib.yog2DashKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog2-kernel", "yog")
@js.native
object yogNs extends js.Object {
  @js.native
  class Yog () extends js.Object {
    @JSName("RAL")
    var RAL_Original: yog2DashKernelLib.Anon_AppendExtPath = js.native
    var ROOT_PATH: java.lang.String = js.native
    @JSName("_")
    var __Original: yog2DashKernelLib.Anon_ with lodashLib.lodashMod.underscoreNs.LoDashStatic = js.native
    @JSName("app")
    var app_Original: expressLib.expressMod.eNs.Express = js.native
    @JSName("express")
    var express_Original: (js.Function0[
        expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Express
      ]) with yog2DashKernelLib.Anon_Application = js.native
    var log: yogDashLogLib.yogDashLogMod.Logger = js.native
    // 当 yog.conf.promise.overrideRAL 为true时，可以当作promise使用
    var ral: yog2DashKernelLib.Anon_AppendExtPath | yog2DashKernelLib.Anon_Name = js.native
    @JSName("ralP")
    var ralP_Original: yog2DashKernelLib.Anon_Name = js.native
    // debug模式时存在
    var reloadApp: js.UndefOr[js.Function1[/* appName */ java.lang.String, scala.Unit]] = js.native
    // debug模式时存在
    var reloadIsomorphic: js.UndefOr[js.Function0[scala.Unit]] = js.native
    // debug模式时存在
    var reloadView: js.UndefOr[js.Function0[scala.Unit]] = js.native
    var view: yog2DashKernelLib.Anon_CleanCache = js.native
    def RAL(serviceName: java.lang.String): nodeDashRalLib.nodeDashRalMod.RALNs.RalRunner = js.native
    def RAL(serviceName: java.lang.String, options: js.Object): nodeDashRalLib.nodeDashRalMod.RALNs.RalRunner = js.native
    /**
      * Creates a lodash object which wraps value to enable implicit method chain sequences.
      * Methods that operate on and return arrays, collections, and functions can be chained together.
      * Methods that retrieve a single value or may return a primitive value will automatically end the
      * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
      *
      * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
      *
      * The execution of chained methods is lazy, that is, it's deferred until value() is
      * implicitly or explicitly called.
      *
      * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
      * is an optimization to merge iteratee calls; this avoids the creation of intermediate
      * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
      * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
      * accept only one argument. The heuristic for whether a section qualifies for shortcut
      * fusion is subject to change.
      *
      * Chaining is supported in custom builds as long as the value() method is directly or
      * indirectly included in the build.
      *
      * In addition to lodash methods, wrappers have Array and String methods.
      * The wrapper Array methods are:
      * concat, join, pop, push, shift, sort, splice, and unshift.
      * The wrapper String methods are:
      * replace and split.
      *
      * The wrapper methods that support shortcut fusion are:
      * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
      * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
      *
      * The chainable wrapper methods are:
      * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
      * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
      * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
      * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
      * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
      * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
      * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
      * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
      * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
      * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
      * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
      * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
      * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
      * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
      * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
      * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
      *
      * The wrapper methods that are not chainable by default are:
      * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
      * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
      * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
      * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
      * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
      * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
      * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
      * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
      * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
      * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
      * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
      * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
      * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
      * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
      * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
      * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
      * upperFirst, value, and words.
      **/
    def `_`[T](value: T): lodashLib.lodashMod.underscoreNs.LoDashImplicitWrapper[T] = js.native
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(
      req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
      res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
    ): js.Any = js.native
    def app(
      req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
      res: nodeLib.httpMod.ServerResponse
    ): js.Any = js.native
    def app(
      req: nodeLib.httpMod.IncomingMessage,
      res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
    ): js.Any = js.native
    def app(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
    def bootstrap(option: yog2DashKernelLib.yog2DashKernelMod.YogBootstrapOption): scala.Unit = js.native
    def bootstrap(option: yog2DashKernelLib.yog2DashKernelMod.YogBootstrapOption, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def express(): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Express = js.native
    def ralP[T](name: java.lang.String): js.Promise[T] = js.native
    def ralP[T](name: java.lang.String, options: js.Object): js.Promise[T] = js.native
  }
  
}

