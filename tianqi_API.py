import requests


def chengshi(canshu):
    url = "https://www.yiketianqi.com/free/week"
    canshu = {"unescape": 1, "appid": "16598342", "appsecret": "tKA60JYa", "city": canshu}
    re = requests.get(url=url, params=canshu)
    html = re.json()
    return html


a = chengshi("杭州")
print(a)
