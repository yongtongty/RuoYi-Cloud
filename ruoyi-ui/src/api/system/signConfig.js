import request from '@/utils/request'

// 查询签单子项 项目列列表
export function listSignConfig(query) {
  return request({
    url: '/system/signConfig/list',
    method: 'get',
    params: query
  })
}

// 查询签单子项 项目列详细
export function getSignConfig(id) {
  return request({
    url: '/system/signConfig/' + id,
    method: 'get'
  })
}

// 新增签单子项 项目列
export function addSignConfig(data) {
  return request({
    url: '/system/signConfig/add',
    method: 'post',
    data: data
  })
}

// 修改签单子项 项目列
export function updateSignConfig(data) {
  return request({
    url: '/system/signConfig/edit',
    method: 'put',
    data: data
  })
}

// 删除签单子项 项目列
export function delSignConfig(id) {
  return request({
    url: '/system/signConfig/' + id,
    method: 'delete'
  })
}
