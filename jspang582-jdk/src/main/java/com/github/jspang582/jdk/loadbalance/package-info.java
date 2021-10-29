/**
 * 生产级负载均衡算法
 * <p>
 *     负载均衡，英文名称为Load Balance，指由多台服务器以对称的方式组成一个服务器集合，每台服务器都*具有等价的地位，都可以单独对外提供服务而无须其他服务器的辅助。
 * 通过某种负载分担技术，将外部发送来的请求均匀分配到对称结构中的某一台服务器上，而接收到请求的服务器*独立地回应客户的请求。
 * 负载均衡能够平均分配客户请求到服务器阵列，借此提供快速获取重要数据，解决大量并发访问服务问题，这种集群技术可以用最少的投资获得接近于大型主机的性能。
 * </p>
 *
 * <ul>
 *     <li>
 *         随机算法-RandomLoadBalance
 *     </li>
 *     <li>
 *         权重随机算法
 *     </li>
 *     <li>
 *         轮询算法-RoundRobinLoadBalance
 *     </li>
 *     <li>
 *         平滑加权轮询
 *     </li>
 *     <li>
 *         一致性哈希算法-ConsistentHashLoadBalance
 *     </li>
 *     <li>
 *          最小活跃数算法-LeastActiveLoadBalance
 *     </li>
 * </ul>
 *
 *
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/29 10:47
 */
package com.github.jspang582.jdk.loadbalance;