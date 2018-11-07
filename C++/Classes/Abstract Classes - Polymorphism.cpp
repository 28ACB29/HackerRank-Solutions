class LRUCache : public Cache
{
    public:
        LRUCache(int capacity)
        {
            this->cp = capacity;
            this->mp;
            this->head = NULL;
            this->tail = NULL;
        }
        int get(int key)
        {
            if(mp.find(key) != mp.end())
            {
                this->head->prev = mp[key]->prev;
                mp[key]->prev = NULL;
                Node* temp = this->head->next;
                this->head->next = mp[key]->next;
                mp[key]->next = temp;
                return mp[key]->value;
            }
            else
            {
                return -1;
            }
        }
        void set(int key, int value)
        {
            if(mp.find(key) != mp.end())
            {
                mp[key]->value = value;
            }
            else
            {
                if(this->mp.size() == this->cp)
                {
                    Node* oldTail = this->tail;
                    this->tail = this->tail->prev;
                    this->mp.erase(this->tail->key);
                    delete oldTail;
                }
                else
                {
                    Node* newHead = new Node(0, this->head, key, value);
                    if(this->mp.size() > 0)
                    {
                        this->head->prev = newHead;
                    }
                    else
                    {
                        this->tail = newHead;
                    }
                    this->head = newHead;
                    mp[key] = newHead;
                }
            }
        }
};